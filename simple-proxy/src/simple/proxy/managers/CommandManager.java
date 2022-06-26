package simple.proxy.managers;

import simple.proxy.loader.Main;
import simple.proxy.commands.OnlineCommand;

public class CommandManager {
    private OnlineCommand online = new OnlineCommand();

    public CommandManager(Main m) {
        Main.getInstance().getProxy().getPluginManager().registerCommand(m, this.online);
    }
}