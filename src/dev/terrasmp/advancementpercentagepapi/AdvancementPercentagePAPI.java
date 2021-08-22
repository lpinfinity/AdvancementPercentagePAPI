package dev.terrasmp.advancementpercentagepapi;

import dev.terrasmp.advancementpercentage.AdvancementPercentage;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class AdvancementPercentagePAPI extends PlaceholderExpansion {

    AdvancementPercentage plugin;

    @Override
    public String getAuthor() {
        return "Eli Watkins";
    }

    @Override
    public String getIdentifier() {
        return "advencement";
    }

    @Override
    public String getVersion() {
        return "Beta 4.0";
    }

    @Override
    public String getRequiredPlugin() {
        return "AdvancementPercentage";
    }

    @Override
    public boolean canRegister() {
        return (plugin = (AdvancementPercentage) Bukkit.getPluginManager().getPlugin(getRequiredPlugin())) != null;
    }

    @Override
    public String onPlaceholderRequest(Player p, String identifier) {
        if(identifier.equalsIgnoreCase("percentage")) {
            return "" + plugin.playerData.getConfig().getInt(p.getUniqueId().toString());
        }
        return null;
    }

}
