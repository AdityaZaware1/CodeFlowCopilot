# 🧠 CodeFlowCopilot – Context-Aware AI Dev Buddy (CLI Edition)

CodeFlowCopilot is an AI-powered Java-based CLI tool that acts like a real-time dev buddy.
It watches your codebase for changes and helps automate tasks like commit message generation, log error explanations, and test coverage checks (coming soon!).

## ✅ Features Implemented So Far

- CLI Setup using Picocli
- Real-time file change detection via WatchService

## 🔧 How to Run

### Fat JAR (recommended)
```
mvn clean compile assembly:single
java -jar target/codeflowcopilot-jar-with-dependencies.jar watch path/to/your/src
```

### Maven direct run
```
mvn compile exec:java -Dexec.mainClass="com.ben.Main" -Dexec.args="watch path/to/your/src"
```

### Without JAR (manual)
```
javac -cp ".;libs/picocli-4.7.6.jar" -d out src/main/java/com/ben/*.java
java -cp ".;out;libs/picocli-4.7.6.jar" com.ben.Main watch path/to/your/src
```

## 🗂️ Project Structure

```
src/
└── main/
    └── java/
        └── com/
            └── ben/
                ├── Main.java           # CLI entry point
                ├── WatchCommand.java   # Handles `watch` subcommand
                └── utils/
                    └── FileWatcher.java # Watches file changes
```

## 📌 Technologies Used

- Java 17
- Picocli 4.7.6
- Maven
- Java WatchService (NIO)

## 🚧 To Be Done (Next Phases)

| Phase       | Feature                                     | Status |
|-------      |-------------------------------------------- |--------|
| 🔜 Phase 2 | Git diff reader using JGit                   | ⏳ |
| 🔜 Phase 3 | AI-powered commit message generator (OpenAI) | ⏳ |
| 🔜 Phase 4 | Error log parser + AI explainer              | ⏳ |
| 🔜 Phase 5 | Test coverage checker (JavaParser)           | ⏳ |
| 🔜 Phase 6 | Context-aware doc search                     | ⏳ |
| 🔜 Phase 7 | Optional IntelliJ plugin                     | ⏳ |

## 💬 Contributing

Want to add Git hooks or OpenAI integration? Start a new branch from `main` and go wild. PRs welcome once stable.

## 👨‍💻 Author

Built by [Aditya Zaware](https://github.com/adityazaware1) — powered by Java + AI
