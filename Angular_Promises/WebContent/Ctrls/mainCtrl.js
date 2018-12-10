var app = angular.module('mainApp', []);

app.factory('myFactory', function($q, $timeout){
	var getMessages = function() {
	      var deferred = $q.defer();
	  
	      $timeout(function() {
	        //deferred.resolve(['Hello', 'world']);
	    	  deferred.reject();
	      }, 2000);
	  
	      return deferred.promise;
	    };
	    
	    return {
	      getMessages: getMessages
	    };
	  
});
app.controller('mainCtrl', function($scope, myFactory){
	myFactory.getMessages().then(
	function(val){
		$scope.names = val;
	},
	function(error){
		$scope.names = ['there is an error'];
	});
});
