CasioWk7600Drumkits {
    var <>drumkits;
	var <>drumnotes;

    *new {
        ^super.new.init();
    }

    select_kit {
        | midiOut, symbol |
        var data = this.drumkits[symbol];
        if (data.notNil) {
            midiOut.program(9, data);
        };
    }

	n {
		| symbol |
		^drumnotes[symbol];
	}

    init {
		drumkits = (
			\StandardKit : 0,
			\RoomKit : 8,
			\RockKit: 16,
			\ElectronicKit : 24,
			\AnalogKit : 25,
			\JazzKit : 32,
			\BrushKit : 40,
			\ClassicalKit : 48
		);

		drumnotes = (
			\AcousticBassDrum : 35,
			\RideCymbal2 : 59,
			\BassDrum1 : 36,
			\HiBongo: 60,
			\SideStick : 37,
			\LowBongo: 61,
			\AcousticSnare: 38,
			\MuteHiConga : 62,
			\HandClap: 39,
			\OpenHiConga: 63,
			\ElectricSnare: 40,
			\LowConga: 64,
			\LowFloorTom : 41,
			\HighTimbale: 65,
			\ClosedHiHat: 42,
			\LowTimbale : 66,
			\HighFloorTom : 43,
			\HighAgogo: 67,
			\PedalHiHat : 44,
			\LowAgogo : 68,
			\LowTom: 45,
			\Cabasa: 69,
			\OpenHiHat: 46,
			\Maracas: 70,
			\LowMidTom: 47,
			\ShortWhistle: 71,
			\HiMidTom : 48,
			\LongWhistle: 72,
			\CrashCymbal1: 49,
			\ShortGuiro: 73,
			\HighTom: 50,
			\LongGuiro: 74,
			\RideCymbal1: 51,
			\Claves: 75,
			\ChineseCymbal: 52,
			\HiWoodBlock: 76,
			\RideBell : 53,
			\LowWoodBlock: 77,
			\Tambourine: 54,
			\MuteCuica: 78,
			\SplashCymbal : 55,
			\OpenCuica: 79,
			\Cowbell: 56,
			\MuteTriangle: 80,
			\CrashCymbal2 : 57,
			\OpenTriangle: 81,
			\Vibraslap: 58,
		);
    }
}
