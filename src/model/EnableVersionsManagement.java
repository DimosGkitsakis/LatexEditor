package model;

public class EnableVersionsManagement {
	private VersionsStrategyFactory strategyFactory;
	public VersionsStrategy getStrategy(String strategyVersion) {
		strategyFactory = new VersionsStrategyFactory(strategyVersion);
		System.out.println(strategyVersion);
		return strategyFactory.createStrategy();
	}
}
