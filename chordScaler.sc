//Initializes Server Boot
Server.default.boot;

// Function to transpose a given pitch up by an octave
// pitch: MIDI note number or frequency
// returns: transposed pitch
{
    arg pitch;
    pitch * 2;
}.store;

// Scales
(
// Major
var majorScale = [0, 2, 4, 5, 7, 9, 11];

// Minor
var minorScale = [0, 2, 3, 5, 7, 8, 10];

// Chromatic
var chromaticScale = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11];

// Phrygian
var phrygianScale = [0, 1, 3, 5, 7, 8, 10];

// Dorian
var dorianScale = [0, 2, 3, 5, 7, 9, 10];

// Mixolydian
var mixolydianScale = [0, 2, 4, 5, 7, 9, 10];

// Transpose and play the scales
Routine({
    majorScale.do({ |degree|
        var pitch = degree.midicps;
        [pitch, pitch.transpose].play;
        1.wait;
    });

    minorScale.do({ |degree|
        var pitch = degree.midicps;
        [pitch, pitch.transpose].play;
        1.wait;
    });

    chromaticScale.do({ |degree|
        var pitch = degree.midicps;
        [pitch, pitch.transpose].play;
        1.wait;
    });

    phrygianScale.do({ |degree|
        var pitch = degree.midicps;
        [pitch, pitch.transpose].play;
        1.wait;
    });

    dorianScale.do({ |degree|
        var pitch = degree.midicps;
        [pitch, pitch.transpose].play;
        1.wait;
    });

    mixolydianScale.do({ |degree|
        var pitch = degree.midicps;
        [pitch, pitch.transpose].play;
        1.wait;
    });
}).play;
)


//Quits Server
s.quit;