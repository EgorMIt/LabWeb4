(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d210ba2"],{b8b8:function(e,s,t){"use strict";t.r(s);var a=function(){var e=this,s=e.$createElement,t=e._self._c||s;return t("div",[e._m(0),t("div",{staticClass:"login_side"},[t("form",{staticClass:"form_log",attrs:{method:"POST"},on:{submit:function(s){return s.preventDefault(),e.submitHandler(s)}}},[t("div",{attrs:{id:"info_log"}},[t("a",{attrs:{id:"text"}},[e._v(" Account Registration ")]),t("div",{staticClass:"input_par"},[t("input",{directives:[{name:"model",rawName:"v-model.trim",value:e.userNameReg,expression:"userNameReg",modifiers:{trim:!0}}],staticClass:"input",class:{invalid:e.$v.userNameReg.$dirty&&!e.$v.userNameReg.required},attrs:{type:"text",name:"name",id:"name",placeholder:"Name"},domProps:{value:e.userNameReg},on:{input:function(s){s.target.composing||(e.userNameReg=s.target.value.trim())},blur:function(s){return e.$forceUpdate()}}}),t("div",[e.$v.userNameReg.$dirty&&!e.$v.userNameReg.required?t("small",{staticClass:"errorText"},[e._v(" Поле не должно быть пустым ")]):e._e()])]),t("div",{staticClass:"input_par"},[t("input",{directives:[{name:"model",rawName:"v-model.trim",value:e.passReg,expression:"passReg",modifiers:{trim:!0}}],staticClass:"input",class:{invalid:e.$v.passReg.$dirty&&!e.$v.passReg.required||e.$v.passReg.$dirty&&!e.$v.passReg.minLength},attrs:{type:"password",name:"pass",id:"pass",placeholder:"Password"},domProps:{value:e.passReg},on:{input:function(s){s.target.composing||(e.passReg=s.target.value.trim())},blur:function(s){return e.$forceUpdate()}}}),t("div",[e.$v.passReg.$dirty&&!e.$v.passReg.required?t("small",{staticClass:"errorText"},[e._v(" Введите пароль ")]):e.$v.passReg.$dirty&&!e.$v.passReg.minLength?t("small",{staticClass:"errorText"},[e._v(" Пароль должен иметь больше "+e._s(e.$v.passReg.$params.minLength.min)+" символов ")]):e._e()])]),t("div",{staticClass:"input_par"},[t("input",{directives:[{name:"model",rawName:"v-model.trim",value:e.$v.pass.$model,expression:"$v.pass.$model",modifiers:{trim:!0}}],staticClass:"input",attrs:{type:"password",name:"pass2",id:"pass2",placeholder:"Repeat Password"},domProps:{value:e.$v.pass.$model},on:{input:function(s){s.target.composing||e.$set(e.$v.pass,"$model",s.target.value.trim())},blur:function(s){return e.$forceUpdate()}}}),t("div",[e.$v.pass.$dirty&&!e.$v.pass.sameAsPassword?t("small",{staticClass:"errorText"},[e._v(" Пароли не совпадают ")]):e._e()])]),e._m(1),t("div",{staticClass:"input_par"},[t("a",[e._v(" Already have an account? ")]),t("router-link",{attrs:{to:"/login"}},[e._v("Sing in")])],1)])])])])},i=[function(){var e=this,s=e.$createElement,t=e._self._c||s;return t("div",{staticClass:"info_dev"},[t("div",{staticClass:"info_dev_text"},[t("p",[e._v("The work was performed by Yuri Batalin and Egor Mitrofanov")]),e._v(" Variant 81327 ")])])},function(){var e=this,s=e.$createElement,t=e._self._c||s;return t("div",{staticClass:"input_par"},[t("button",{staticClass:"btn_in",attrs:{type:"submit"}},[e._v(" Registration ")])])}],r=t("b5ae"),n=t("bc3a"),o=t.n(n),l={name:"reg",data:function(){return{userNameReg:"",passReg:"",pass:""}},validations:{userNameReg:{required:r["required"]},passReg:{required:r["required"],minLength:Object(r["minLength"])(5)},pass:{sameAsPassword:Object(r["sameAs"])("passReg")}},methods:{submitHandler:function(){if(this.$v.$invalid)this.$v.$touch();else{var e={userNameReg:this.userNameReg,passReg:this.passReg};o.a.post("http://localhost:8080/rest/reg",e).then((function(e){console.log(e)})).catch((function(e){console.log(e)})),this.$router.push("/login")}}}},u=l,p=t("2877"),d=Object(p["a"])(u,a,i,!1,null,null,null);s["default"]=d.exports}}]);
//# sourceMappingURL=chunk-2d210ba2.f57feb7c.js.map