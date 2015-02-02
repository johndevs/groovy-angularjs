/**
 * Created by john on 2/2/15.
 */
class Services implements AngularModule {

    def init() {

        // Create services module
        def services = angular.module('myAppServices', ['ngResource'])

        // Create Time service
        services.factory('TimeService', { $resource ->
            $resource('http://date.jsontest.com/')
        })

    }
}
