/*
 * new issue button onlcick popup createissueForm function
 */
function createIssueForm_Popup(){
	$('#createIssueForm').animate({height: "toggle", opacity: "toggle"}, "slow");
}

/*
 * jquery document.ready() funtion for home page
 */
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
				
				addIssueTable(data);
			},
			error 	 : function(e) {
				console.log("ERROR: ", e);
			}
		});
	});
	$(window).load(function(event) {
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
	});
});
/*
 * end jquery document.ready() funtion for home page
 */

function addIssueTable(data) {
	var	state, issueId, issueTitle, stateClass, date;
	$('#issueTable tr:gt(0)').remove();
	if (data != null) {
		for (var i = 0; i < data.length; i++) {
			issueId 	= data[i].issueid;
			issueTitle 	= data[i].issuetitle;
			state 		= data[i].state;
			date		= data[i].createdate;
			
			/*
			 * checking which type of state and change the class
			 */
			if (state) {
				switch (state) {
				  case "Active":
					  stateClass ="<span class='label label-success'>"+state+"</span>"
				    break;
				  case "close":
					  stateClass ="<span class='label label-danger'>"+state+"</span>"
					  break;
				}
			}else {
				stateClass ="<span class='label label-danger'>"+"null"+"</span>"
			}
			
			// formate date by moment.js funtion
			date = moment(date).format("DD MMM YYYY");
			/*
			 * following method create for dynamic add table row
			 */
			$('#issueTable tr:last').after("<tr>" +
					"<td>"+"<a href='"+'issue/'+issueId+"' targer='_blank'>"+issueId+"</a>"+"</td>" +
					"<td>"+"<a href='"+'issue/'+issueId+"' targer='_blank'>"+issueTitle+"</a>"+"</td>" +
					"<td>"+stateClass+"</td>" +
					"<td>"+data[i].createby+"</td>" +
					"<td>"+data[i].assignee+"</td>" +
					"<td>"+date+"</td>" +
					"<tr>");
		}
	}
}
