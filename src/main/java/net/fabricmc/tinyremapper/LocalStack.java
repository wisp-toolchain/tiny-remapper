package net.fabricmc.tinyremapper;

import org.objectweb.asm.tree.analysis.Frame;

public class LocalStack {

	public record LocalFrame(Frame startFrame, Frame endLabel) {
//		private final Frame startFrame;
	}
}
