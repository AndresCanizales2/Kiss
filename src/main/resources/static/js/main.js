function darkMode() {
  document.body.classList.toggle("dark-mode");
}

function progressBar() {
  $(".progress-bar").html("<div class='in' style='--timer: 300s;'></div>");
}

$(function() {
  $("#datepicker").datepicker({
    dateFormat: "dd/mm/yy",
    firstDay: 1,
    onSelect: function (date, datepicker) {
      retrieveData();
    }
  });

  $("#datepicker").datepicker('setDate', 'today');

  retrieveData();
  setInterval(function() {
    retrieveData();
  }, 300000);
});

function retrieveData() {
  var date = $("#datepicker").val().split("/").reverse().join("-");
  var url = '/snapshots';

  if (date != '') {
    url = url + '/' + date;
    $("#panel").load(url);
    progressBar();
  } else {
    console.log('error');
  }
}

function openProjectModal(id) {
  $.ajax({
    url: "/snapshots/" + id + "/projects",
    success: function(data) {
      $("#projectModalHolder").html(data)
      $('#projectModal').modal('show');
    }
  })
}
