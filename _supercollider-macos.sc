(

s.options.numBuffers = 1024 * 16;
s.options.memSize = 8192 * 16;
s.options.maxNodes = 1024 * 64;
s.options.numOutputBusChannels = 2;

s.waitForBoot {
	~dirt = SuperDirt(2, s);

	s.sync;
	~dirt.start(57120, [0]);

	MIDIClient.init;

	~rytmOut = MIDIOut.newByName("Elektron Analog Rytm", "Analog Rytm out 1");
    ~rytmOut.latency = 0;
    ~dirt.soundLibrary.addMIDI(\rytm, ~rytmOut);


};
s.latency = 0;
);

