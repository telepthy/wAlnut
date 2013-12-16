Research/Programming TO DO List
===============================
Read First: Before working on a item below, please put your e-mail in the task [your e-mail here]
        so that anyone else interested will be able to collaborate with you. Good luck!
<b>Researching Tasks</b>
  - Hard) Decide how to implement optical pathway.
	Detailed biological image 1: http://db.tt/T0Gs7lMe image 2: http://db.tt/IDQYLbr1 
	--circle connect from retine to LGN    -random connect from LGN to V1
	- input picture => active cells from bottom region to top region => motor output => next 
	input picture!

  - Easy) Draw MARK II with 2 regions layer 3 of lower region connecting to layer 3 of upper region

  - Hard) Begin drawing detailed diagram of connections in the human brain with 2 retine
	Retina=>LGN =>V1 =>V2 =>V4=>IT (Reference [1]) 

  - ???) Reunderstand neural network digit recognition system

  - Hard) Encorder transducer for retine. Find ted talk about it

  - Very Hard) http://math.stackexchange.com/questions/442497/combinatorics-arrangement-problem
    + estimate with 64x1 coin flips?
    + partial answer from MIT combinatorics professor: http://db.tt/tnwPBW65
    + look into circle packing where all circles touch with minimal radius
    + construction of codes?

  - ???) How many sequences can Temporal Pooler learn? Use combinatorics

  - Medium) Research Mammal Audio System and think about AudioCell implementation
    Human auditory range: 64 Hertz to 15,000 Hertz (middle aged adult) research how a cochlear implant really
    works, making a sound wave in the environment into an electrical signal

  - Hard) Write up a easy/intuitive explanation of how the illusion of the Hermann grid is created
    using WalnutiQ MARK II model:
    + https://www.dropbox.com/s/03a9sujz36xj5vw/2013-06-17%2010.40.44.jpg
    + http://www.nku.edu/~issues/illusions/HermannGrid.htm

  - Medium) How does brian code for different shades of grey. Different greys must produce 
    different level of cell activity. How do the photoreceptors do so? Red Rectangluar
    Connection with No overlap, Green..., Blue... How to implement Retine.java?

  - ???) Theory of muscle control with no initial control(how does a baby control it’s bladder)
	Theory behind cascades with controlling the eye, build software eye model
	+ Every region of the neocortex generates motor behavior
	+ http://www.youtube.com/watch?v=1_eT5bsS4bQ
	+ thoughts: muscle output goes back to the bottom of neocortex as input

  - Very Hard) Biologically accurate explanation of ebbinghaus illusion, ponzo illusion,
	Interesting facts: moon illusion disappears when you inverse input
	Possible explanation: convergence micropasia


<b>Programming Tasks</b>
  - Medium) inhibitionRadius of active Columns is not working correctly
	+ see printout of computeActiveColumns
	+ Remove all System.out.println used in Test_SpatialPooler

  - Very Hard) Implement TemporalPooler class. Use 50% done implementation from MARK I.
	(Requires a lot of understanding of output of SpatialPooler class) [quinnliu@vt.edu]
	http://www.youtube.com/watch?v=QLDlBRAlSAM

  - Easy) Enforce global inhibition for performSpatialPooling(int percentOutput)
	
  - Medium) Iterate through a directory during training instead of one image file. 
	+ http://stackoverflow.com/questions/14407040/iterating-through-a-directory-in-java

  - ???) Running Java in ubuntu remote server Amazon ec2 t1.micro instance for free

  - Very Hard) Train MARK II on MNIST handwritten digit dataset 

  - Easy) Exceptions for Temporal class when done implementation

<b>Computer Vision Research Comparison Chart</b>
NOTE: All comments should be made to be objective as possible
Image Recognition Techniques
Pros
Cons
Bag of Words/Features


1) Because only a frequency of a unique set of pixels are stored there is no spatial information being stored.
2) Does not work for images with more than one object.
3) Not capable of being unsupervised or able to learn by itself.
Support Vector Machine


1) Not visualizable after 3 features are learned(all useful support vector machines will have more than 3 features)
WalnutiQ 
1) Based on human neocortex biology theory
2) Implemented with global and local inhibition to specifically for vision research


1) Hard to find the parameters used during training to create a good image classifier
3) Only has spatial pooling implemented and not yet TemporalPooling
NuPIC
1) Based on human neocortex biology theory
1) Implemented source code is hard to understand
Deep Learning Neural Networks





-------------------------------------------------------References------------------------------------------------------
[1] https://www.dropbox.com/s/dpdywrbf2hp6wld/AI2008.pdf