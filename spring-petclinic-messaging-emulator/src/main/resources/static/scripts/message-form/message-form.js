<<<<<<< HEAD
'use strict';

angular.module('messageForm', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('messages', {
                parent: 'app',
                url: '/messages',
                template: '<message-form></message-form>'
            })
    }]);

=======
'use strict';

angular.module('messageForm', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('messages', {
                parent: 'app',
                url: '/messages',
                template: '<message-form></message-form>'
            })
    }]);

>>>>>>> 6e3198fbc6cb0628b0a8e9deaddadc31547cf178
