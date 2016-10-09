/*
 * new issue button onlcick popup createissueForm function
 */
function createIssueForm_Popup(){
	$('#createIssueForm').animate({height: "toggle", opacity: "toggle"}, "slow");
}

$(document).ready(function($) {
	$("#issueCreateForm").submit(function(event) {
		event.preventDefault();
		var data = {}
		data["issuetitle"]   = $("#issueTitle").val(),
		data["issueDescription"]= $("#issueDescription").val(),
		data["assignee"]   = $("#assignee").val(),
		data["createby"]= $("#username").val(),
		url = "issue/create";
		
		var token = $('#csrfToken').val();
		var header = $('#csrfHeader').val();
		
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
					data	= resonse.data;
				$('#issueTable tr:gt(0)').remove();
				if (data != null) {
					for (var i = 0; i < data.length; i++) {
						$('#issueTable tr:last').after("<tr>" +
								"<td>"+data[i].issueid+"</td>" +
								"<td>"+data[i].issuetitle+"</td>" +
								"<td>"+"<span class='label label-success'>"+data[i].state+"</span>"+"</td>" +
								"<td>"+data[i].createby+"</td>" +
								"<td>"+data[i].assignee+"</td>" +
								"<td>"+data[i].createdate+"</td>" +
								"<tr>");
					}
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
				
			}
		});
	});
	$(window).load(function() {
		event.preventDefault();
		var url = "issue/load";
		$.ajax({
			type 	 : "get",
			url      : url,
			success  : function(resonse) {
				var message = "registration Sucess",
				data	= resonse.data;
				$('#issueTable tr:gt(0)').remove();
				if (data != null) {
					for (var i = 0; i < data.length; i++) {
						$('#issueTable tr:last').after("<tr>" +
								"<td>"+data[i].issueid+"</td>" +
								"<td>"+data[i].issuetitle+"</td>" +
								"<td>"+"<span class='label label-success'>"+data[i].state+"</span>"+"</td>" +
								"<td>"+data[i].createby+"</td>" +
								"<td>"+data[i].assignee+"</td>" +
								"<td>"+data[i].createdate+"</td>" +
								"<tr>");
					}
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
				
			}
		});
	});
});

