package winlyps.noMobGriefing

import org.bukkit.plugin.java.JavaPlugin

class NoMobGriefing : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("mobGriefing", "false")
        }
        logger.info("NoMobGriefing plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoMobGriefing plugin has been disabled.")
    }
}