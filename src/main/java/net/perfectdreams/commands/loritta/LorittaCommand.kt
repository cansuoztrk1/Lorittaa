package net.perfectdreams.commands.loritta

import com.mrpowergamerbr.loritta.utils.Constants
import com.mrpowergamerbr.loritta.utils.LorittaPermission
import net.dv8tion.jda.core.Permission
import net.perfectdreams.commands.Command
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

open class LorittaCommand(override val labels: Array<String>) : Command() {
	open val onlyOwner: Boolean = false
	open val cooldown: Int = 5000
	open var executedCount: Int = 0
	open val hasCommandFeedback: Boolean = true
	open val botPermissions = listOf<Permission>()
	open val discordPermissions = listOf<Permission>()
	open val lorittaPermissions = listOf<LorittaPermission>()
	open val canUseInPrivateChannel: Boolean = true
	open val requiresMusic: Boolean = false
}

@ExperimentalContracts
fun <T> LorittaCommand.notNull(value: T?, message: String, prefix: String = Constants.ERROR) { // Contracts precisam ser fora de uma classe, então...
	contract {
		returns() implies (value != null)
	}
	if(value == null) throw CommandException(message, prefix)
}