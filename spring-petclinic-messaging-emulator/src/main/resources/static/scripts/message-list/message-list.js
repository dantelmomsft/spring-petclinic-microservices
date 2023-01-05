<<<<<<< HEAD
'use strict';

angular.module('messageList', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('message-list', {
                parent: 'app',
                url: '/message-list',
                template: '<message-list></message-list>'
            })
    }]);

=======
'use strict';

angular.module('messageList', ['ui.router'])
    .config(['$stateProvider', function ($stateProvider) {
        $stateProvider
            .state('message-list', {
                parent: 'app',
                url: '/message-list',
                template: '<message-list></message-list>'
            })
    }]);

>>>>>>> 6e3198fbc6cb0628b0a8e9deaddadc31547cf178
