var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('SearchCtrl',function($scope,$http) {
	
    $scope.interets = ['...'];
    
    $scope.geeks = ['...'];
    
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
    
    $scope.initInterets();
    $scope.initGeeks();
	
});