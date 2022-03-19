package com.adilmx.spring_jaxws_app.dto;

import java.util.Date;

import com.adilmx.spring_jaxws_app.entity.TypeAccount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	private String lib;
	private double solde;
	private Date dateCreation;
	private TypeAccount type;
}
