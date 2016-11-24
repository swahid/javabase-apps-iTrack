
$(document).ready(function($) {
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
		var url = "issue/load";
		console.log(commentList);
		/*$.ajax({
			type 	 : "get",
			url      : url,
			success  : function(resonse) {
				var message = "registration Sucess",
				    data	= resonse.data;
				addIssueTable(data);
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
			}
		});*/
	});
});