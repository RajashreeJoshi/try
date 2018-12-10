var app = angular.module("libApp", []);
    app.controller("libCtrl", function($scope) {
        $scope.book = "The Alchemist";
        $scope.author = "Paulo Coelho";
    });