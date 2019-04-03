import React from 'react';
import {Route, Switch} from 'react-router-dom';
import Home from './views/home/Home';
import Login from './views/user/login/Login';
import Register from './views/user/register/Register';
import About from './views/about/About';

const Routes = () => (
        <Switch>
            <Route exact path="/" component={Home}/>
            <Route exact path="/about" component={About}/>
            <Route exact path="/login" component={Login}/>
            <Route exact path="/register" component={Register}/>
        </Switch>
)

export default Routes;