package com.training.targus;

import org.springframework.stereotype.Component;

@Component
public class Bill {

	public Bill() {
	}
	public String bill() {
		return "<br/><p>Margin Supermarket</p>------------------------------------------<br/>"
	+ "Item name&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Qty&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;Price";
	}
}
