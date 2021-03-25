package info.nightscout.androidaps.plugins.pump.common.data

class DoseSettings constructor(val step: Double, val durationStep: Int, val maxDuration: Int, val minDose: Double, val maxDose: Double = Double.MAX_VALUE)