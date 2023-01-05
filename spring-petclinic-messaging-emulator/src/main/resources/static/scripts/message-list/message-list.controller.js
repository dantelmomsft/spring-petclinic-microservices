<<<<<<< HEAD
'use strict';

angular.module('messageList')
    .controller('MessageListController', ["$http", '$state', '$stateParams', function ($http, $state, $stateParams) {
        var self = this;


        $http.get('asb').then(function (resp) {
            self.messages = resp.data;
        });

        self.refresh = function () {
            $http.get('asb').then(function (resp) {
                self.messages = resp.data;
            });
        };
    }]);
=======
'use strict';

angular.module('messageList')
    .controller('MessageListController', ["$http", '$state', '$stateParams', function ($http, $state, $stateParams) {
        var self = this;


        $http.get('asb').then(function (resp) {
            self.messages = resp.data;
        });

        self.refresh = function () {
            $http.get('asb').then(function (resp) {
                self.messages = resp.data;
            });
        };
    }]);
>>>>>>> 6e3198fbc6cb0628b0a8e9deaddadc31547cf178
