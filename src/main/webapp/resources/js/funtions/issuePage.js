
    
$(document).ready(function($) {
	//bootstrap WYSIHTML5 - text editor
    $(".textarea").wysihtml5();
	$("#commentBox").submit(function(event) {
		event.preventDefault();
		var data 	= {},
			url,token,header, issueId;
		
		data["commentsTitle"]   	= $("#CommentsTitle").val();
		data["commentsUser"]		= $("#commentor").val();
		data["issueId"] 			= $("#issueId").val();
		data["userId"]				= $("#userId").val();
		data["commentsDescription"] = $("#commentDescription").val();
		
		
		issueId = $("#issueId").val();
		url 	= issueId;
		token 	= $('#csrfToken').val();
		header 	= $('#csrfHeader').val();
		
		$.ajax({
			type 	 : "POST",
			url      : url,
			data 	 : JSON.stringify(data),
			dataType : 'json',
			beforeSend: function(xhr) {
		        xhr.setRequestHeader("Accept", "application/json");
		        xhr.setRequestHeader("Content-Type", "application/json");
		        xhr.setRequestHeader(header, token);
		    },
			success  : function(resonse) {
				var message = "registration Sucess",
					data	= resonse.data,
					message	= resonse.message;
				console.log(data);
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
			}
		});
	});
	$(window).load(function(event) {
		event.preventDefault();
		var value = $("#issueId").val();
		var url = value+"/comments";
		
		$.ajax({
			type 	 : "get",
			url      : url,
			success  : function(resonse) {
				var data	= resonse.data;
				console.log(data);
				
				fetchComments(data);
								
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
			}
		});
	});
	
	/*
	 * Following function for fetch comments and append to comments list
	 */
	
	function fetchComments(data) {
		var n	= data.length,
			i=0;
		$("#commentSize").text(data.length +" Comments");
//		$('#commentList div:gt(0)').remove();
//		jQuery("#commentList").show();
		while(n > 0){
			var date = moment(data[i].commentsDate).format("DD MMM YYYY h:m:s");
//			jQuery("#commentList").append(jQuery("#commentList").children().first().clone());
			jQuery("#commentList").after(
				'<div class="box-body">'+
	            '<div class="form-group">'+
	        	data[i].commentsDescription+
	        	'</div>'+
	        	'<div class="box-footer commetns">'+
	        	'<div class="pull-right">'+
	                '<p><a href="#" target="_blank">'+data[i].commentsUser+'</a><br>'+
	                	'<span>'+date+'</span>'+
	                '</p>'+
	        	'</div>'+
			    '</div>'+
			    '</div>'
		    );
			n -= 1;
			i += 1;
		}
	}
});