package com.bankui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankui.beans.Deposit;
import com.bankui.beans.Setting;
import com.bankui.beans.Transfer;
import com.bankui.beans.Account;
import org.springframework.ui.Model;

@Controller
public class DashboardController {
	String path="dashboard/"; 
	@Autowired
	private Transfer transfer;
	
	@Autowired
	private Deposit deposit;
	
	@Autowired
	private Account account;

	@RequestMapping("/dashboard")
	public String showDashboard(Model model) {
		return "dashboard";
	}

	@RequestMapping("/transfer")
	public String showTransferScreen(Model model) {
		model.addAttribute("transfer", transfer);
		
		return path+"transfer";
	}

	@RequestMapping("/deposit")
	public String showDepositScreen(Model model) {
		model.addAttribute("deposit",deposit);
		
		return path+"deposit";
	}

	@RequestMapping("/statement")
	public String showStatementScreen(Model model) {
		model.addAttribute("msg", "");
		return path+"statement";
	}

	@RequestMapping("/balance")
	public String showBalanceScreen(Model model) {
		model.addAttribute("account",account);
		
		return path+"balance";
	}

	@RequestMapping("/settings")
	public String showSettingsScreen(Model model) {
		
		return path+"settings";
	}

	@RequestMapping("/help")
	public String showHelpScreen(Model model) {
		return path+"help";
	}

}
