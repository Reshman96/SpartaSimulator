#SpartaSimulator
###Project 3 of Sparta Global's java engineering course.

SpartaSimulator is a program that models the growth of a training company.

As part of this model, a random number of trainees are recruited each month, each of which studies a specific course. 
One of three types of training centres open on a regular basis, which can house trainees up to a set maximum capacity.
The user may alter the number of months that the program runs for, as well as many other properties using a single 
config file, and the outputs are saved to a file as well as printed to the command line.


## Table of contents
* [Installation](#Installation)
* [Implemented Use algorithms](#Use)
* [Areas of potential extension](#Areas-of-potential-extension)
* [Contributing](#Contributing)
* [Authors and acknowledgment](#Authors-and-acknowledgment)


## Installation

[comment]: <> (tbd)

## Use

In order to run the program, the user should first edit the variables found in the config file, found at 
"src/main/resources/config.properties". Outputs will then be saved to "src/main/resources/sparta_simulation_csv.csv", 
as well as displayed in the command window.

Note that if the config file is corrupted in any way, deleting it and then running the program should result in a fresh 
config file being generated with default values.

## Areas of potential extension

* Currently, trainees stay in training centres forever. Perhaps they could "graduate" after a certain amount of time, 
freeing up space in the training centres.
* Currently, the rate of trainee recruitment is constant. Perhaps this could be dynamically altered to reflect the
increase of word of mouth, recruitment etc as the company grows.
* Currently, the rate of creation of training centres is constant, and the type of centre is always randomly generated. 
Perhaps these could be dynamically altered to reflect responding to demand.
* Currently, the model makes no effort to estimate expenditure and revenue.

## Contributing

Project not currently open for extension.

## Authors and acknowledgment

Authors: Alexander Jarrett, Callum Davies-Keogh, George Gregory, Hanif Ali, Harry Jones, James Dorling, James Smith, 
Louis Clement-Harris, Melvin Thomas, Michael Makam, Pavle Svrdlin, Pawel Dyjak, Reshman Siva, Tony Parsons.

Thank you very much to Manish Gadhvi and Kieran Cornwall, our trainers for this course. 