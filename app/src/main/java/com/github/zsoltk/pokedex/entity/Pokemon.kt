package com.github.zsoltk.pokedex.entity

import com.github.zsoltk.pokedex.R

data class Pokemon(
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val typeOfPokemon: List<String>? = null,
    val category: String? = null,
    val image: Int? = null,
    val hp: Int? = null,
    val attack: Int? = null,
    val defense: Int? = null,
    val specialAttack: Int? = null,
    val specialDefense: Int? = null,
    val speed: Int? = null,
    val total: Int? = null
)

fun Pokemon.color(): Int {
    val type = typeOfPokemon?.elementAtOrNull(0)

    return when (type?.toLowerCase()) {
        "grass", "bug" -> R.color.poke_light_teal
        "fire" -> R.color.poke_light_red
        "water", "fighting", "normal" -> R.color.poke_light_blue
        "electric", "psychic" -> R.color.poke_light_yellow
        "poison", "ghost" -> R.color.poke_light_purple
        "ground", "rock" -> R.color.poke_light_brown
        "dark" -> R.color.poke_black
        else -> return R.color.poke_light_blue
    }
}

val pokemons = listOf(
    Pokemon(
        id = "#001",
        name = "Bulbasaur",
        description = "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger.",
        typeOfPokemon = listOf("Grass", "Poison"),
        category = "Seed",
        image = R.drawable.poke001,
        hp = 30,
        attack = 30,
        defense = 30,
        specialAttack = 40,
        specialDefense = 30,
        speed = 30,
        total = 190
    ),
    Pokemon(
        id = "#002",
        name = "Ivysaur",
        description = "There is a bud on this Pokémon's back. To support its weight, Ivysaur's legs and trunk grow thick and strong. If it starts spending more time lying in the sunlight, it's a sign that the bud will bloom into a large flower soon.",
        typeOfPokemon = listOf("Grass", "Poison"),
        category = "Seed",
        image = R.drawable.poke002,
        hp = 30,
        attack = 40,
        defense = 40,
        specialAttack = 50,
        specialDefense = 40,
        speed = 40,
        total = 240
    ),
    Pokemon(
        id = "#003",
        name = "Venusaur",
        description = "There is a large flower on Venusaur's back. The flower is said to take on vivid colors if it gets plenty of nutrition and sunlight. The flower's aroma soothes the emotions of people.",
        typeOfPokemon = listOf("Grass", "Poison"),
        category = "Seed",
        image = R.drawable.poke003
    ),
    Pokemon(
        id = "#004",
        name = "Charmander",
        description = "The flame that burns at the tip of its tail is an indication of its emotions. The flame wavers when Charmander is enjoying itself. If the Pokémon becomes enraged, the flame burns fiercely.",
        typeOfPokemon = listOf("Fire"),
        category = "Lizard",
        image = R.drawable.poke004,
        hp = 20,
        attack = 30,
        defense = 20,
        specialAttack = 30,
        specialDefense = 20,
        speed = 40,
        total = 160
    ),
    Pokemon(
        id = "#005",
        name = "Charmeleon",
        description = "Charmeleon mercilessly destroys its foes using its sharp claws. If it encounters a strong foe, it turns aggressive. In this excited state, the flame at the tip of its tail flares with a bluish white color.",
        typeOfPokemon = listOf("Fire"),
        category = "Flame",
        image = R.drawable.poke005,
        hp = 30,
        attack = 30,
        defense = 30,
        specialAttack = 40,
        specialDefense = 30,
        speed = 40,
        total = 200
    ),
    Pokemon(
        id = "#006",
        name = "Charizard",
        description = "Charizard flies around the sky in search of powerful opponents. It breathes fire of such great heat that it melts anything. However, it never turns its fiery breath on any opponent weaker than itself.",
        typeOfPokemon = listOf("Fire"),
        category = "Flame",
        image = R.drawable.poke006,
        hp = 30,
        attack = 40,
        defense = 30,
        specialAttack = 50,
        specialDefense = 40,
        speed = 50,
        total = 240
    ),
    Pokemon(
        id = "#007",
        name = "Squirtle",
        description = "Squirtle's shell is not merely used for protection. The shell's rounded shape and the grooves on its surface help minimize resistance in water, enabling this Pokémon to swim at high speeds.",
        typeOfPokemon = listOf("Water"),
        category = "Tiny Turtle",
        image = R.drawable.poke007,
        hp = 20,
        attack = 30,
        defense = 30,
        specialAttack = 20,
        specialDefense = 30,
        speed = 20,
        total = 150
    ),
    Pokemon(
        id = "#008",
        name = "Wartortle",
        description = "Its tail is large and covered with a rich, thick fur. The tail becomes increasingly deeper in color as Wartortle ages. The scratches on its shell are evidence of this Pokémon's toughness as a battler.",
        typeOfPokemon = listOf("Water"),
        category = "Turtle",
        image = R.drawable.poke008,
        hp = 30,
        attack = 30,
        defense = 40,
        specialAttack = 30,
        specialDefense = 30,
        speed = 30,
        total = 190
    ),
    Pokemon(
        id = "#009",
        name = "Blastoise",
        description = "Blastoise has water spouts that protrude from its shell. The water spouts are very accurate. They can shoot bullets of water with enough accuracy to strike empty cans from a distance of over 160 feet.",
        typeOfPokemon = listOf("Water"),
        category = "Shellfish",
        image = R.drawable.poke009,
        hp = 30,
        attack = 40,
        defense = 40,
        specialAttack = 40,
        specialDefense = 40,
        speed = 40,
        total = 230
    ),
    Pokemon(
        name = "Caterpie",
        id = "#010",
        description = "Caterpie has a voracious appetite. It can devour leaves bigger than its body right before your eyes. From its antenna, this Pok\u00e9mon releases a terrifically strong odor.",
        typeOfPokemon = listOf("Bug"),
        category = "Worm",
        image = R.drawable.poke010,
        hp = 20,
        attack = 20,
        defense = 20,
        specialAttack = 10,
        specialDefense = 10,
        speed = 30,
        total = 110
    ),
    Pokemon(
        name = "Metapod",
        id = "#011",
        description = "The shell covering this Pok\u00e9mon's body is as hard as an iron slab. Metapod does not move very much. It stays still because it is preparing its soft innards for evolution inside the hard shell.",
        typeOfPokemon = listOf("Bug"),
        category = "Cocoon",
        image = R.drawable.poke011,
        hp = 20,
        attack = 10,
        defense = 30,
        specialAttack = 10,
        specialDefense = 10,
        speed = 20,
        total = 100
    ),
    Pokemon(
        name = "Butterfree",
        id = "#012",
        description = "Butterfree has a superior ability to search for delicious honey from flowers. It can even search out, extract, and carry honey from flowers that are blooming over six miles from its nest.",
        typeOfPokemon = listOf("Bug", "Flying"),
        category = "Butterfly",
        image = R.drawable.poke012,
        hp = 30,
        attack = 20,
        defense = 20,
        specialAttack = 40,
        specialDefense = 30,
        speed = 40,
        total = 180
    ),
    Pokemon(
        name = "Weedle",
        id = "#013",
        description = "Weedle has an extremely acute sense of smell. It is capable of distinguishing its favorite kinds of leaves from those it dislikes just by sniffing with its big red proboscis (nose).",
        typeOfPokemon = listOf("Bug", "Poison"),
        category = "Hairy Bug",
        image = R.drawable.poke013,
        hp = 20,
        attack = 20,
        defense = 20,
        specialAttack = 10,
        specialDefense = 10,
        speed = 30,
        total = 110
    ),
    Pokemon(
        name = "Kakuna",
        id = "#014",
        description = "Kakuna remains virtually immobile as it clings to a tree. However, on the inside, it is extremely busy as it prepares for its coming evolution. This is evident from how hot the shell becomes to the touch.",
        typeOfPokemon = listOf("Bug", "Poison"),
        category = "Cocoon",
        image = R.drawable.poke014,
        hp = 20,
        attack = 10,
        defense = 20,
        specialAttack = 10,
        specialDefense = 10,
        speed = 20,
        total = 90
    ),
    Pokemon(
        name = "Beedrill",
        id = "#015",
        description = "Beedrill is extremely territorial. No one should ever approach its nest\u2014this is for their own safety. If angered, they will attack in a furious swarm.",
        typeOfPokemon = listOf("Bug", "Poison"),
        category = "Poison Bee",
        image = R.drawable.poke015,
        hp = 30,
        attack = 50,
        defense = 20,
        specialAttack = 20,
        specialDefense = 30,
        speed = 40,
        total = 190
    ),
    Pokemon(
        name = "Pidgey",
        id = "#016",
        description = "Pidgey has an extremely sharp sense of direction. It is capable of unerringly returning home to its nest, however far it may be removed from its familiar surroundings.",
        typeOfPokemon = listOf("Normal", "Flying"),
        category = "Tiny Bird",
        image = R.drawable.poke016,
        hp = 20,
        attack = 20,
        defense = 20,
        specialAttack = 20,
        specialDefense = 20,
        speed = 30,
        total = 130
    ),

    Pokemon(
        name = "Pidgeotto",
        id = "#017",
        description = "Pidgeotto claims a large area as its own territory. This Pok\u00e9mon flies around, patrolling its living space. If its territory is violated, it shows no mercy in thoroughly punishing the foe with its sharp claws.",
        typeOfPokemon = listOf("Normal", "Flying"),
        category = "Bird",
        image = R.drawable.poke017,
        hp = 30,
        attack = 30,
        defense = 30,
        specialAttack = 20,
        specialDefense = 20,
        speed = 40,
        total = 170
    ),
    Pokemon(
        name = "Pidgeot",
        id = "#018",
        description = "This Pok\u00e9mon has a dazzling plumage of beautifully glossy feathers. Many Trainers are captivated by the striking beauty of the feathers on its head, compelling them to choose Pidgeot as their Pok\u00e9mon.",
        typeOfPokemon = listOf("Normal", "Flying"),
        image = R.drawable.poke018,
        category = "Bird",
        hp = 30,
        attack = 40,
        defense = 30,
        specialAttack = 30,
        specialDefense = 30,
        speed = 50,
        total = 210
    ),
    Pokemon(
        name = "Rattata",
        id = "#019",
        description = "Rattata is cautious in the extreme. Even while it is asleep, it constantly listens by moving its ears around. It is not picky about where it lives\u2014it will make its nest anywhere.",
        typeOfPokemon = listOf("Normal"),
        category = "Mouse",
        image = R.drawable.poke019,
        hp = 20,
        attack = 30,
        defense = 20,
        specialAttack = 10,
        specialDefense = 20,
        speed = 40,
        total = 140
    ),
    Pokemon(
        name = "Raticate",
        id = "#020",
        description = "Raticate's sturdy fangs grow steadily. To keep them ground down, it gnaws on rocks and logs. It may even chew on the walls of houses.",
        typeOfPokemon = listOf("Normal"),
        category = "Mouse",
        image = R.drawable.poke020,
        hp = 20,
        attack = 40,
        defense = 30,
        specialAttack = 20,
        specialDefense = 30,
        speed = 50,
        total = 190
    ),
    Pokemon(
        name = "Spearow",
        id = "#021",
        description = "Spearow has a very loud cry that can be heard over half a mile away. If its high, keening cry is heard echoing all around, it is a sign that they are warning each other of danger.",
        typeOfPokemon = listOf("Normal", "Flying"),
        category = "Tiny Bird",
        image = R.drawable.poke021,
        hp = 20,
        attack = 30,
        defense = 20,
        specialAttack = 20,
        specialDefense = 10,
        speed = 40,
        total = 140
    ),
    Pokemon(
        name = "Fearow",
        id = "#022",
        image = R.drawable.poke022,
        description = "Fearow is recognized by its long neck and elongated beak. They are conveniently shaped for catching prey in soil or water. It deftly moves its long and skinny beak to pluck prey.",
        category = "Beak",
        typeOfPokemon = listOf("Normal", "Flying"),
        hp = 30,
        attack = 50,
        defense = 30,
        specialAttack = 30,
        specialDefense = 30,
        speed = 50,
        total = 220
    ),
    Pokemon(
        name = "Ekans",
        id = "#023",
        description = "Ekans curls itself up in a spiral while it rests. Assuming this position allows it to quickly respond to a threat from any direction with a glare from its upraised head.",
        typeOfPokemon = listOf("Poison"),
        category = "Snake",
        image = R.drawable.poke023,
        hp = 20,
        attack = 30,
        defense = 20,
        specialAttack = 20,
        specialDefense = 20,
        speed = 30,
        total = 140
    ),
    Pokemon(
        name = "Arbok",
        id = "#024",
        description = "This Pok\u00e9mon is terrifically strong in order to constrict things with its body. It can even flatten steel oil drums. Once Arbok wraps its body around its foe, escaping its crunching embrace is impossible.",
        typeOfPokemon = listOf("Poison"),
        category = "Cobra",
        image = R.drawable.poke024,
        hp = 30,
        attack = 40,
        defense = 30,
        specialAttack = 30,
        specialDefense = 30,
        speed = 40,
        total = 200
    ),
    Pokemon(
        name = "Pikachu",
        id = "#025",
        description = "This Pok\u00e9mon has electricity-storing pouches on its cheeks. These appear to become electrically charged during the night while Pikachu sleeps. It occasionally discharges electricity when it is dozy after waking up.",
        typeOfPokemon = listOf("Electric"),
        category = "Mouse",
        image = R.drawable.poke025,
        hp = 20,
        attack = 30,
        defense = 20,
        specialAttack = 20,
        specialDefense = 20,
        speed = 50,
        total = 160
    ),
    Pokemon(
        name = "Raichu",
        id = "#026",
        description = "This Pok\u00e9mon exudes a weak electrical charge from all over its body that makes it take on a slight glow in darkness. Raichu plants its tail in the ground to discharge electricity.",
        typeOfPokemon = listOf("Electric"),
        category = "Mouse",
        image = R.drawable.poke026,
        hp = 30,
        attack = 50,
        defense = 30,
        specialAttack = 40,
        specialDefense = 30,
        speed = 60,
        total = 240
    ),
    Pokemon(
        name = "Sandshrew",
        id = "#027",
        description = "Sandshrew has a very dry hide that is extremely tough. The Pok\u00e9mon can roll into a ball that repels any attack. At night, it burrows into the desert sand to sleep.",
        typeOfPokemon = listOf("Ground"),
        category = "Mouse",
        image = R.drawable.poke027,
        hp = 20,
        attack = 40,
        defense = 40,
        specialAttack = 10,
        specialDefense = 10,
        speed = 20,
        total = 140
    ),
    Pokemon(
        name = "Sandslash",
        id = "#028",
        description = "Sandslash can roll up its body as if it were a ball covered with large spikes. In battle, this Pok\u00e9mon will try to make the foe flinch by jabbing it with its spines. It then leaps at the stunned foe to tear wildly with its sharp claws.",
        typeOfPokemon = listOf("Ground"),
        category = "Mouse",
        image = R.drawable.poke028,
        hp = 30,
        attack = 50,
        defense = 50,
        specialAttack = 20,
        specialDefense = 20,
        speed = 40,
        total = 210
    )
)
