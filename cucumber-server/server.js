var express = require("express")
var app = express()
var cors = require("cors")

app.use(cors())

app.get("/",(req,res) => {
    res.sendFile('static/index.html', {root: __dirname })
})

app.get("/verify",(req,res) => {
    if(req.query.uname === "admin" && req.query.pwd === "admin"){
        res.sendFile('static/loginsuccess.html', {root: __dirname })
    }
    else{
        res.sendFile('static/loginfail.html', {root: __dirname })
    }
    
})

app.listen(3000)