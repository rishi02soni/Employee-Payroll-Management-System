let employees = [];

function addEmployee(){
let name = document.getElementById("name").value;
let salary = document.getElementById("salary").value;

employees.push({name,salary});
showEmployees();
}

function showEmployees(){
let list = document.getElementById("list");
list.innerHTML = "";

employees.forEach((emp,index)=>{
list.innerHTML += `
<li>${emp.name} - ₹${emp.salary}
<button onclick="removeEmp(${index})">❌</button>
</li>`;
});
}

function removeEmp(index){
employees.splice(index,1);
showEmployees();
}
