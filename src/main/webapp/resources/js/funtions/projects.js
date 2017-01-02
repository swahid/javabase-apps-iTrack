/*
 * jquery document.ready() funtion for home page
 */
$(document).ready(function($) {
		var url = 'issue/load';
		$('#projectTable').dataTable({
			'ajax' 		 : url,
	        'serverSide' : true,
	        columns 	 : [{
            	title	 : "Issue id",
            	data 	 : 'issueid'
    		},{
    			title	 : "Title",
    			data   : 'issuetitle'
			},{
				title	 : "Creator",
				data   : 'createby'
			},{
				title	 : "Assinge",
				data   : 'assignee'
			}],
			searching 	 : true,
		    ordering	 : true
		});
	
});

/*############### Ajax Funtion #####################  */

function sendAjax(url) {
    var returnData = '';
    $.ajax({
		type 	 : 'get',
		url      : url,
		success  : function(resonse) {
			returnData= resonse;
			return returnData;
		},
		error 	 : function(e) {
			console.log('ERROR: ', e);
			alert('NoData')
		}
	});
}