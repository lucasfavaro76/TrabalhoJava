$(document).ready(function () {
    $('#myTable').DataTable();
});

$(document).ready(function () {
    $('#MyTable').dataTable(
            {
                "language":
                        {
                            "info": "Pagína _PAGE_ of _PAGES_"

                        }
            }
    );
}
);

$(document).ready(function () {
    $('#MyTable').dataTable({
        "lengthMenu": [[5, 20, 50, -1], [5, 20, 50, "All"]]
    });
});