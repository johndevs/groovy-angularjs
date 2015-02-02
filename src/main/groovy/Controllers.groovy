/**
 * Created by john on 2/2/15.
 */
class Controllers implements AngularModule {

    def init() {

        // Create the controllers module
        def controllers = angular.module('myAppControllers', ['myAppServices'])

        // Create time controller with injected scope and time service
        controllers.controller('TimeController', { $scope, TimeService ->

            // Get time from time service
            $scope.time = TimeService.get()
        })
    }
}
