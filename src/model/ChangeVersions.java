package model;

public class ChangeVersions {
	
	private VersionsStrategy strategy;
	private VersionsStrategyFactory strategyFactory;
	private String strategyVersion;
	private VersionsStrategy tempStrategy;

	public ChangeVersions(VersionsStrategy strategy, String strategyVersion) {
		this.strategy=strategy;
		this.strategyVersion=strategyVersion;
	}
	
	public VersionsStrategy Swap() {
		if(strategyVersion.equals("volatile")){
			strategyFactory = new VersionsStrategyFactory("stable");
			tempStrategy = strategyFactory.createStrategy();
			for(int i=0;i<strategy.getEntireHistory().size();i++) {
				tempStrategy.putVersion(strategy.getEntireHistory().get(i));
			}
		}else {
			strategyFactory = new VersionsStrategyFactory("volatile");
			tempStrategy = strategyFactory.createStrategy();
			for(int i=0;i<strategy.getEntireHistory().size();i++) {
				tempStrategy.putVersion(strategy.getEntireHistory().get(i));
			}
		}
		return tempStrategy;
	}

}
