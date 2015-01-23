# Flume-local-source
Local files in directories are source of events for flume. Is intended for huge files in local directories.

##Requirements:
Apache-flume ng mayor to 1.4.0

##Flume configuration file
ACTIVE LIST 
agent.sources = r1

agent.sinks = k1

agent.channels = c1  

agent.sources.r1.type = org.apache.flume.source.DirectorySource

agent.sources.r1.name.folder = ../directory

agent.sources.r1.run.discover.delay=10000

agent.sinks.k1.type = logger
agent.channels.c1.type = memory
agent.channels.c1.capacity = 1000
agent.channels.c1.transactionCapacity = 100
agent.sinks.k1.channel = c1


