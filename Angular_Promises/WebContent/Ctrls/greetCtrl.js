var app = angular.module('app',[]);
app.factory('myFactory',function($timeout, $q, $log){
	
	var print=function(){
		var deferred = $q.defer();
		$log.debug("New promise object: ",deferred);
		var data=['Morning','Afternoon','Evening','Night'];
		$timeout(function(){
			//deferred.reject("No Data Present Here! :(");
			deferred.resolve(data);
			} , 30);
		$log.debug("After resolving promise object: ",deferred);
		return deferred.promise;
		}
	return { print : print};
});

app.controller('myCtrl',function($scope , myFactory){
   var arr;
   $scope.printData=function(){
	   //----------------------------------Service Call---------------------------
	myFactory.print().then(function(response){
		arr = response;
		$scope.hi = "Neha";
		
		if($scope.time >=0 && $scope.time <13){
			$scope.greeting=arr[0];	   
			}
		else if($scope.time >=13 && $scope.time <16){
			$scope.greeting=arr[1];	
			}
		else if($scope.time >=16 && $scope.time <19){
			$scope.greeting=arr[2];
		}
		else{
			$scope.greeting=arr[3];
		}	
	},
	function(errorReason){
		$scope.hi = "Bhushan "+ errorReason;
	});
		//----------------------------------Service Call End---------------------------
   }
});