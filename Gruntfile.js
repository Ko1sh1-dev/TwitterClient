
module.exports = function (grunt) {
    grunt.registerTask('launch', function() {
    var exec = require('child_process').exec;

    var done = this.async();
    var command = 'javac src/*.java;';
    command += 'cd src; java MainApp;';
    command += 'rm -rf *.class';
    var options = { timeout: 120000 };
    var callback = function(error, stdout, stderr) {
      console.log(stdout);
      done();
    };
    exec(command, options, callback);
  });
};
