$(function () {
    $("#jqTable").jqGrid({
        url: baseURL + 'sys/user/list',
        datatype: "json",
        colModel: [
            {lable: '物料类型', name: 'type', width: 40, key: true},
            {label: '物料序号', name: 'number', width: 40},
            {lable: '物料名称', name: 'name', width: 90},
            {lable: '物料规格', name: 'specification', width: 50},
            {lable: '数量', name: 'ammount', width: 50},
            {lable: '地址编号', name: 'locnumber', width: 50},
            {lable: '单位', name: 'unit', width: 40},
            {lable: '备注', name: '备注', width: 200}
        ],
        viewrecords: true,
        height: 400,
        rowNum: 5,
        rowList:[5, 10, 15],
        rownumbers: true,
        rownumWidth: 25,
        autoWidth: true,
        pager: "#tablePager",
        jsonReader: {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames: {
            page: "page",
            rows: "limit",
            order: "order"
        },
        gridComplete:function() {
            $("#jqTable").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" })
        }

    })
});

var vm = new Vue({
    el: '#bizaccount',
    data: {
        showlist: true
    },
    methods: {
        query: function () {
            vm.reload()
        },
        reload: function() {
            vm.showList = true
            console.log("reload.....")
            var page = $("jqTable").jqGrid('getGridParam', 'page');
            $("#jqTable").jqGrid('setGridParam', {
                page: page
            }).trigger("reloadGrid");
        }
    }
});