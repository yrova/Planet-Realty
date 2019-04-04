import React, {Component} from 'react';
import LeftMenu from './LeftMenu';
import RightMenu from './RightMenu';
import {Drawer, Button} from 'antd';
import './NavBar.css';

class NavBar extends Component {
    state ={
        current: 'mail',
        visible: false
    }
    
    showDrawer = () => {
        this.setState({
            visible: true,
        });
    };

    onClose = () => {
        this.setState({
            visible: false,
        });
    };

    render(){
        return (
            <nav className="menu-bar">
                <div className="menu-logo">
                    <a href="/">logo</a>
                </div>
                <div className="menu-container">
                    <div className="left-menu">
                        <LeftMenu />
                    </div>
                    <div className="right-menu">
                        <RightMenu/>
                    </div>
                    <Button className="bar-menu" type="primary" onClick={this.showDrawer}>
                        <span className="bars-btn"></span>
                    </Button>
                    <Drawer
                        title="Basic Drawer"
                        placement="right"
                        closable={false}
                        onClose={this.onClose}
                        visible={this.state.visible}
                    >
                        <LeftMenu/>
                        <RightMenu/>
                    </Drawer>
                </div>
            </nav>
        )
    }
}

export default NavBar;