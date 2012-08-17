package org.yi.acru.bukkit.Lockette;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {

	Lockette plugin;
	
	public CommandHandler(Lockette _plugin) {
		
		plugin = _plugin;
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
		
		Player player = null;
		
		if(sender instanceof Player) {
			player = (Player) sender;	// Handling in command preprocess for now.
		}
		
		if (player == null) //do this some other way soon - gravypod
		if(args.length == 1){
			if(args[0].equalsIgnoreCase("reload")){
				plugin.loadProperties(true);
				
				plugin.localizedMessage(null, Lockette.broadcastReloadTarget, "msg-admin-reload");
				
				//String msgString = Lockette.strings.getString("msg-admin-reload");
				//selectiveBroadcast(Lockette.broadcastReloadTarget, ChatColor.RED + "Lockette: " + msgString);
			}
		}
		//sender.sendMessage("Lockette: Test");
		
		return(true);
		
	}

}
