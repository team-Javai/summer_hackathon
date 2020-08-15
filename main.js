const neta = documents.querySelecter('.add');
const list = documnents.querySelecter('.Neta');

(function(){
    // 初期化処理
    // ローカルストレージに格納されている値を取得し、リストを生成する
    for(var key in localStorage){
        var html = localStorage.getItem(key);
        if (html) {
            list.innerHTML += localStorage.getItem(key);
        }
    }
})();

const saveTaskToLocalStorage = (task, html) => {
    // null は、localStorage に保存しない
    if(html){
        // localStorage は、0 から始まる
        localStorage.setItem(task, html);
        return;
    }
    return;
}

const deleteTaskFromLocalStorage = task => {
    localStorage.removeItem(task);
    return;
}

//追加機能
const createNetaList = task => {
    const html = `
        <li class="list-group-item d-flex justify-content-between align-items-center">
        <span>${task}</span>
        <i class="far fa-trash-alt delete"></i>
        </li>
    `;
    list.innerHTML += html;
    saveTaskToLocalStrage(task, html);
}

//消去機能
neta.addEventListener('submit', e => {
    e.preventDefault();

});

neta.addEventListener('click', e => {
    if (e.target.classList.contains('delete')){
        e.target.parentElement.remove();

        const task = e.target.parentElement.textContent.trim()
        deleteTaskFromLocalStorage(task);
    }
});