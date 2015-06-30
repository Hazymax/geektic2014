var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('SearchCtrl',function($scope,$http) {
	
    $scope.interets = undefined;
    $scope.mygeek = undefined;
    $scope.mygeeks = undefined;
    $scope.filterInteret = undefined;
    $scope.filterSexe = undefined;
    
    $scope.initGeeks = function() {
    	$http.get('search/initGeeks')
    	.then(function(response){
    		$scope.geeks = response.data
    	});
    };
	
    $scope.initInterets = function(){
        $http.get('search/initInterets')
            .then(function(response){
            $scope.interets = response.data;
        });
    };
    
    $scope.searchGeeks = function(){
    	$http.post('search/searchGeeks',$scope.mygeek)
    	.then(function(response){
    		$scope.mygeeks = response.data;
    	});
    };
    
    $scope.initInterets();
    $scope.initGeeks();
	
});