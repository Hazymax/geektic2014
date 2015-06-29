var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('SearchCtrl',function($scope,$http) {
	
    $scope.interets = ['...'];
	
    $scope.initInterets = function(){
        $http.get('search/interets')
            .then(function(response){
            $scope.interets = response.data;
        });
    };
    
    $scope.initNewGeek = function(){
    	$scope.newGeek = {
    			name: '',
    			sexe: '',
    			interets: null
    	}
    }
    
    $scope.addInteret = function(){
    	$http.post('search/add',$scope.interets)
    	.then(function(response){
    		$scope.newGeek = {
    				interets: response.data;
    		});
    	});
    };
    
    $scope.searchGeek = function(){
    	
    });
    
	
}