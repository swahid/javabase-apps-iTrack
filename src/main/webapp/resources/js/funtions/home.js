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
				if (data != null) {
					$("#tableBody").empty()
					$("#tableBody").addClass("table table-hover")
					for (var i = 0; i < data.length; i++) {
						$("#tableBody").append("<tr>");
		                $("#tableBody").append("<td>"+data[i].issueid+"</td>");
		                $("#tableBody").append("<td>"+data[i].issuetitle+"</td>");
		                $("#tableBody").append("<td>"+data[i].state+"</td>");
		                $("#tableBody").append("<td>"+data[i].createby+"</td>");
		                $("#tableBody").append("<td>"+data[i].assignee+"</td>");
		                $("#tableBody").append("<td>"+data[i].createdate+"</td>");
		                $("#tableBody").append("<tr>");
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
				if (data != null) {
					$("#tableBody").empty()
					$("#tableBody").addClass("table table-hover")
					for (var i = 0; i < data.length; i++) {
						$("#tableBody").append("<tr>");
		                $("#tableBody").append("<td>"+data[i].issueid+"</td>");
		                $("#tableBody").append("<td>"+data[i].issuetitle+"</td>");
		                $("#tableBody").append("<td class='label label-success'>"+data[i].state+"</td>");
		                $("#tableBody").append("<td>"+data[i].createby+"</td>");
		                $("#tableBody").append("<td>"+data[i].assignee+"</td>");
		                $("#tableBody").append("<td>"+data[i].createdate+"</td>");
		                $("#tableBody").append("<tr>");
					}
				}
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
				
			}
		});
	});
});