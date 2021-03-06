/*
 * Copyright 2004-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.payment.cybs.mapping;

import org.springframework.mapping.Mapper;
import org.springframework.payment.core.PaymentTransaction;
import org.springframework.payment.gateway.GatewayResponse;
import org.springframework.payment.gateway.GatewayResponseMapper;

/**
 * A base class for all CyberSource {@link Mapper} types that map from a 
 * {@link GatewayResponse} to a {@link PaymentTransaction}.
 * 
 * @author Rossen Stoyanchev
 */
public class PaymentTransactionMapper extends GatewayResponseMapper<PaymentTransaction> {

	public PaymentTransactionMapper() {
		super(PaymentTransaction.class);
		addMapping("requestID", "transactionId");
		addMapping("decision");
		addMapping("reasonCode", "decisionCode");
	}

}
