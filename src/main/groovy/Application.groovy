/**
 * Created by john on 2/2/15.
 */
class Application implements AngularModule {

    def init(){

        // Create application
        def app = angular.module('myApp', ['myAppControllers', 'ngRoute'])

        // Create routes
        app.config { $routeProvider, $locationProvider ->

            $routeProvider.when('/', [
                    templateUrl: 'html/home.html'
            ]).when('/view1', [
                    templateUrl: 'html/view1.html'
            ]).when('/view2', [
                    templateUrl: 'html/view2.html'
            ]).otherwise({
                redirectTo: '/'
            });
        }
    }
}
