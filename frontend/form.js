angular.module('FormApp', [])
    .controller('FormController', function ($scope, $http, $timeout) {

        //TODO: detalhar os erros. eg: valor de limite inválido
        $scope.successWhenSendingFormData = false;
        $scope.errorWhenSendingFormData = false;
        $scope.errorMsgFromServer = '';

        $scope.form = {
            risk: 'A'
        }

        $scope.sendFormData = function (form) {
            $scope.errorWhenSendingFormData = false;
            var req = {
                method: 'POST',
                url: 'http://localhost:8080/v1/account',
                data : angular.toJson(form),
                headers: {
                    'Content-Type': 'application/json'
                },
            }
            $http(req).then(
                function (success) {
                    $scope.successWhenSendingFormData = true;
                    $timeout(function () {
                        $scope.successWhenSendingFormData = false;
                    }, 5000);
                },
                function (failure) {
                    $scope.errorWhenSendingFormData = true;
                    $scope.errorMsgFromServer = failure;
                }
            )
        }
    });