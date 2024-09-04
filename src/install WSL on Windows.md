# Install Linux on Windows with WSL

Підсистема Windows для Linux (WSL) дозволяє розробникам інсталювати дистрибутив Linux (наприклад, Ubuntu, OpenSUSE, Kali, Debian, Arch Linux тощо) і використовувати програми Linux, утиліти та інструменти командного рядка Bash безпосередньо в Windows, без змін, без накладних витрат традиційної віртуальної машини або налаштування подвійного завантаження.

You can now install everything you need to run **_WSL_** with a single command. **_Open PowerShell_** or **_Windows Command Prompt_** in administrator mode by right-clicking and selecting **_“Run as administrator”_**, enter the wsl — install command, then restart your machine.

```shell
wsl --install
```
This command will enable the features necessary to run WSL and install the Ubuntu distribution of Linux.
```shell
$pdw 
```
## List available Linux distributions
```shell
wsl --list --online
```
## List installed Linux distributions
```shell
wsl --list --verbose
```