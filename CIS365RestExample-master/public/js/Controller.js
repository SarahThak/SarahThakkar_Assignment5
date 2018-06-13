/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 app.controller('appController', ["$scope", "$log", "appService",
    function($scope, $log, appService) {

        // Sets scope
        $scope.planets= appService.getPlanet();

        $scope.loadPlanets = function () {
            var promiseGet = appService.getPlanet();
            promiseGet.then(function (result) {
                if (result && result.data) {
                    $scope.planets = result.data;
                }
            }, function (reason) {
                $log.error("failure loading database information", reason);
            });
        };

        $scope.loadPlanets();

}]);


