package com.mrpowergamerbr.loritta.parallax.wrappers

import net.dv8tion.jda.core.entities.Guild

class ParallaxGuild(private val guild: Guild) {
	// TODO: afkChannel
	val afkChannelID get() = guild.afkChannel.id
}