var app = angular.module('mainApp', []);

app.controller('mainCtrl', function($scope, $log){
	$scope.name = "Neha";
	
	$scope.array = ['1', '2', '3'];
	
	$scope.printMessage = function(){
		msg = sayBye();
		$log.info(msg);
		msg = sayHi();
		$log.debug(msg);
	};
	
	var sayHi = function(){
		return "Hi";
	}
	
	function sayBye(){
		return "Bye";
	}
	
	$scope.showName = function(){
		return true;
	};
});
