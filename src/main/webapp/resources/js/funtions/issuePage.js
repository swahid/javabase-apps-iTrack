
$(document).ready(function($) {
	$("#commentBox").submit(function(event) {
		event.preventDefault();
		var data 	= {},
			url,token,header, issueId;
		
		data["commentor"]	= $("#commentor").val();
		data["userId"]		= $("#userId").val();
		data["title"]   	= $("#CommentsTitle").val();
		data["description"] = $("#commentDescription").val();
		data["issueid"] 	= $("#issueId").val();
		data["issuetitle"]  = $("#CommentsTitle").val();
		
		
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
				alert(message);
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
				alert("unable to save");
			}
		});
	});
	/*$(window).load(function(event) {
		event.preventDefault();
		var url = "issue/load";
		$.ajax({
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
		});
	});*/
});