/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.dto.idao;

import com.uscabi.commons.UserCredential;

/**
 *
 * @author noman-pc
 */
public interface IUserCredentialDAO extends IGenericDAO<UserCredential, Long> {
        public UserCredential findUser(String username);
}
